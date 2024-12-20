document.getElementById('add-eml-btn').addEventListener('click', () => {
    const emailInput = document.getElementById('email-input');
    const emailType = document.getElementById('email-type').value;
    const email = emailInput.value.trim();

    if (email && !emailExists(email)) {
        const emailItem = document.createElement('div');
        emailItem.className = 'email-item';
        emailItem.draggable = true;
        emailItem.textContent = email;
        emailItem.setAttribute('data-type', emailType === 'cc' ? 'cc-eml' : 'bcc-eml');

        emailItem.addEventListener('dragstart', handleDragStart);
        emailItem.addEventListener('dragend', handleDragEnd);

        const targetBox = emailType === 'cc' ? document.getElementById('cc-box') : document.getElementById('bcc-box');
        targetBox.appendChild(emailItem);
        emailInput.value = '';
    } else {
        alert('Email is either empty or already exists!');
    }
});

function emailExists(email) {
    const allEmails = document.querySelectorAll('.email-item');
    return Array.from(allEmails).some(item => item.textContent.trim() === email);
}

function handleDragStart(e) {
    e.dataTransfer.setData('text/plain', e.target.outerHTML);
    e.target.parentElement.removeChild(e.target); // Remove from previous box
}

function handleDragEnd(e) {
    e.target.classList.remove('dragging');
}

document.querySelectorAll('.email-box').forEach(box => {
    box.addEventListener('dragover', e => e.preventDefault());
    box.addEventListener('drop', e => {
        e.preventDefault();
        const draggedHTML = e.dataTransfer.getData('text/plain');
        const draggedElement = document.createElement('div');
        draggedElement.innerHTML = draggedHTML;
        const emailItem = draggedElement.firstElementChild;

        if (emailItem && !emailExists(emailItem.textContent.trim())) {
            emailItem.addEventListener('dragstart', handleDragStart);
            emailItem.addEventListener('dragend', handleDragEnd);

            emailItem.setAttribute(
                'data-type',
                box.id === 'cc-box' ? 'cc-eml' : 'bcc-eml'
            );
            box.appendChild(emailItem);
        }
    });
});
