<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Request data</title>
    <style>
        h1 {
            text-align: center;
        }

        p {
            text-align: justify;
            margin: 20px 60px;
        }

        #req {
            margin: 10px 100px;
        }

        #list {
            margin-top: 30px;
        }

        tr {
            text-align: center;
            height: 32px;
            /* width: 32px; */
        }

        #list {
            display: none;
        }
    </style>
</head>

<body>

    <!-- Another Containers -->


    <div id="main-container">
        <h1>Main Page</h1>
        <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Eos perspiciatis, magnam nisi numquam blanditiis
            saepe facilis necessitatibus itaque, cumque veritatis debitis pariatur? Optio eveniet sint beatae dolorem
            ipsam! Sed laudantium nemo facere. Cumque, sit cupiditate magnam optio libero dolore, a recusandae, vel
            velit illum enim pariatur quod! Doloremque, labore cupiditate magnam nemo deserunt blanditiis? Dicta illum
            quis sint libero eligendi pariatur maxime animi iure, repudiandae accusantium totam sequi voluptate expedita
            nostrum obcaecati dolorem molestiae! Dignissimos obcaecati dolor dolore eum cum praesentium qui! Placeat
            dolore enim consectetur veritatis id, itaque perferendis omnis, dolores laboriosam incidunt doloribus ipsum
            soluta porro magnam eum voluptate iure molestiae nisi deleniti quia accusantium expedita corrupti
            praesentium! Dolore recusandae sunt consequatur rerum suscipit fugit. Unde, quod expedita.</p>
    </div>

    <input type="button" value="Request Data" id="req">

    <table id="list" border="1" align="center" width="50%">
        <tr id="th">
            <th>Name</th>
            <th>Email</th>
            <th>dob</th>
            <th>...</th>
            <th>...</th>
        </tr>

        <!-- <tr>
            <td>Nayan Soni</td>
            <td>nayan@gmail.com</td>
            <td>12/11/2003</td>
            <td><a href="">Edit</a></td>
            <td><a href="">Delete</a></td>
        </tr> -->



    </table>


    <script>
        // let data = null;


        // requesting data from server
        document.getElementById('req').addEventListener('click', () => {
            let req = new XMLHttpRequest();

            req.open("get", "list.do", true);


            req.addEventListener('readystatechange', () => {
                if (req.readyState == 4 && req.status == 200) {
                    let data = JSON.parse(req.responseText);
                    console.log(data);
                    fillList(data);
                    // console.log(res);
                }
            });
            req.send();
        });


        function fillList(data){
            if(data != null){
                let list = document.getElementById("list");
                list.style.display = "table";
                list.innerHTML = "";

                for(let object of data){
                    
                    let tr = document.createElement("tr");
                    list.append(tr);

                    for(let i=1;i<6;i++){
                        let td = document.createElement("td");
                        if(i==1)td.innerText = object["fullName"];
                        else if(i==2)td.innerText = object["email"];
                        else if(i==3)td.innerText = object["dob"];
                        else if(i==4) td.innerHTML = "<a href='#'>Edit</a>";
                        else if(i==5) td.innerHTML = "<a href='#'>Delete</a>";

                        tr.append(td);
                    }
                }
            }
        }
    </script>
</body>

</html>