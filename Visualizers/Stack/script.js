// Toggle menu for mobile view
let menuOpen = false;

function toggleMenu() {
    const nav = document.getElementById("nav");
    const icon = document.getElementById("menu-icon");

    menuOpen = !menuOpen;

    if (menuOpen) {
        nav.classList.add("open");
        icon.classList.remove("fa-bars");
        icon.classList.add("fa-times");
    } else {
        nav.classList.remove("open");
        icon.classList.remove("fa-times");
        icon.classList.add("fa-bars");
    }
}

window.addEventListener("resize", () => {
    if (window.innerWidth >= 768) {
        document.getElementById("nav").classList.remove("open");
        document.getElementById("menu-icon").classList.remove("fa-times");
        document.getElementById("menu-icon").classList.add("fa-bars");
        menuOpen = false;
    }
});

// Stack operations
let stack = [];

function updateStats() {
    const top = stack[stack.length - 1];
    const max = Math.max(...stack);
    const min = Math.min(...stack);
    const sum = stack.reduce((a, b) => a + b, 0);
    const avg = (sum / stack.length).toFixed(2);

    document.getElementById("top").innerText = stack.length ? top : "-";
    document.getElementById("max").innerText = stack.length ? max : "-";
    document.getElementById("min").innerText = stack.length ? min : "-";
    document.getElementById("sum").innerText = stack.length ? sum : "-";
    document.getElementById("avg").innerText = stack.length ? avg : "-";
    document.getElementById("count").innerText = stack.length;
}

function renderStack() {
    const container = document.getElementById("stack-container");
    container.innerHTML = "";
    stack.forEach((item) => {
        const div = document.createElement("div");
        div.className = "stack-item";
        div.innerText = item;
        container.appendChild(div);
    });
}

function push() {
    const input = document.getElementById("stack-input");
    const value = parseInt(input.value);
    if (!isNaN(value)) {
        stack.push(value);
        input.value = "";
        renderStack();
        updateStats();
    }
}

function pop() {
    if (stack.length > 0) {
        stack.pop();
        renderStack();
        updateStats();
    } else {
        alert("Stack is empty!");
    }
}

function peek() {
    if (stack.length > 0) {
        alert("Top element: " + stack[stack.length - 1]);
    } else {
        alert("Stack is empty!");
    }
}

function printStack() {
    if (stack.length > 0) {
        alert("Stack: " + stack.join(", "));
    } else {
        alert("Stack is empty!");
    }
}

function openSearchMenu() {
    let choice = prompt(
        `Choose an option:
1 - isFound(value)
2 - getIndex(value)
3 - getElement(index)
4 - getMiddle()
5 - getLast()`
    );

    switch (choice) {
        case "1":
            isFound(parseInt(prompt("Enter value:")));
            break;
        case "2":
            getIndex(parseInt(prompt("Enter value:")));
            break;
        case "3":
            getElement(parseInt(prompt("Enter index:")));
            break;
        case "4":
            getMiddle();
            break;
        case "5":
            getLast();
            break;
        default:
            alert("Invalid choice");
    }
}

function swapData() {
    let val1 = prompt("Enter first value to swap:");
    let val2 = prompt("Enter second value to swap:");
    if (val1 === null || val2 === null) return;

    let idx1 = stack.indexOf(Number(val1));
    let idx2 = stack.indexOf(Number(val2));

    if (idx1 === -1 || idx2 === -1) {
        alert("One or both values not found in the stack.");
        return;
    }
    [stack[idx1], stack[idx2]] = [stack[idx2], stack[idx1]];
    renderStack();
    updateStats();
}

function swapIndex() {
    const i1 = parseInt(prompt("Enter first index:"));
    const i2 = parseInt(prompt("Enter second index:"));

    if (i1 < 0 || i1 >= stack.length || i2 < 0 || i2 >= stack.length)
        return alert("Invalid indices");

    [stack[i1], stack[i2]] = [stack[i2], stack[i1]];
    renderStack();
    updateStats();
}

function removeDuplicates() {
    stack = [...new Set(stack)];
    renderStack();
    updateStats();
}

function reverseStack() {
    stack.reverse();
    renderStack();
    updateStats();
}

function randomize() {
    if (stack.length === 0) {
        alert("Stack is empty!");
        return;
    }

    for (let i = stack.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [stack[i], stack[j]] = [stack[j], stack[i]];
    }

    renderStack();
    updateStats();
}

function sortStack() {
    stack.sort((a, b) => a - b);
    renderStack();
    updateStats();
}

function clearStack() {
    stack = [];
    renderStack();
    updateStats();
}

function isFound(value) {
    alert(stack.includes(value) ? "Value exists" : "Value not found");
}

function getIndex(value) {
    const idx = stack.indexOf(value);
    alert(idx !== -1 ? "Index: " + idx : "Value not found");
}

function getElement(index) {
    alert(
        stack[index] !== undefined ? "Element: " + stack[index] : "Invalid index"
    );
}

function getMiddle() {
    if (stack.length === 0)
        return alert("Stack is empty");

    const mid = Math.floor(stack.length / 2);
    alert("Middle element: " + stack[mid]);
}

function getLast() {
    if (stack.length === 0)
        return alert("Stack is empty");

    alert("Last element: " + stack[stack.length - 1]);
}

function openHelp() {
    document.getElementById("helpOverlay").style.display = "block";
}
function closeHelp() {
    document.getElementById("helpOverlay").style.display = "none";
}
window.onload = function () {
    openHelp();
};
