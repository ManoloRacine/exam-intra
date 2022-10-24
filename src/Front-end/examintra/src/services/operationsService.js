export const additionPost = async (firstNumber, secondNumber) => {
    return fetch("http://localhost:8080/operations/addition", {
        method: "POST",

        body: JSON.stringify({
            firstNumber: firstNumber,
            secondNumber: secondNumber
        }),

        headers: {
            "Content-type" : "application/json;"
        }
    });
}

export const substractionPost = async (firstNumber, secondNumber) => {
    return fetch("http://localhost:8080/operations/substraction", {
        method: "POST",

        body: JSON.stringify({
            firstNumber: firstNumber,
            secondNumber: secondNumber
        }),

        headers: {
            "Content-type" : "application/json;"
        }
    });
}