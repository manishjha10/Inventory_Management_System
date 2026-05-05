const API = "http://localhost:8080/products";

function loadData() {
    fetch(API)
    .then(res => res.json())
    .then(data => {

        let html = "";
        let low = 0;

        data.forEach(p => {
            if (p.quantity < 5) low++;

            html += `
                <tr>
                    <td>${p.name}</td>
                    <td>${p.sku}</td>
                    <td class="${p.quantity < 5 ? 'low' : ''}">
                        ${p.quantity}
                    </td>
                    <td>
                        <button class="action add" onclick="stockIn(${p.id})">+</button>
                        <button class="action remove" onclick="stockOut(${p.id})">-</button>
                        <button class="action delete" onclick="deleteProduct(${p.id})">Delete</button>
                    </td>
                </tr>
            `;
        });

        document.getElementById("tableBody").innerHTML = html;
        document.getElementById("totalProducts").innerText = data.length;
        document.getElementById("lowStock").innerText = low;
    });
}

function addProduct() {
    const product = {
        name: name.value,
        sku: sku.value,
        category: category.value,
        price: price.value,
        quantity: quantity.value,
        threshold: 5
    };

    fetch(API, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(product)
    }).then(loadData);
}

function deleteProduct(id) {
    fetch(API + "/" + id, { method: "DELETE" })
    .then(loadData);
}

function stockIn(id) {
    fetch(`http://localhost:8080/transactions/in?productId=${id}&qty=1`, {
        method: "POST"
    }).then(loadData);
}

function stockOut(id) {
    fetch(`http://localhost:8080/transactions/out?productId=${id}&qty=1`, {
        method: "POST"
    }).then(loadData);
}

loadData();
