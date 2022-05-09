
let angka = document.getElementById("num1")
let angkaDua = document.getElementById("num2")
let operator = document.getElementById("operator")


function ProcessAction(num1, num2, operator) {
	
    switch (operator) {
        case '+': return num1 + num2
        case '-': return num1 - num2
        case '*': return num1 * num2
        case '/': return num1 / num2
    }
	
}

const Result = () => {
	
	
	let hasil = ProcessAction(Number(angka.value), Number(angkaDua.value), operator.value);
	
	document.getElementById('hasil').innerHTML = hasil;

}