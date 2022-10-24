import { useState } from "react";
import { additionPost, substractionPost } from "../services/operationsService";


const Main = () => {
    const [addition, setAddition] = useState("pas encore d'addition")
    const [substraction, setSubstraction] = useState("pas encore de soustraction")
    const [firstNumberAddition, setFirstNumberAddition] = useState("")
    const [secondNumberAddition, setSecondNumberAddition] = useState("")
    const [firstNumberSubstraction, setFirstNumberSubstraction] = useState("")
    const [secondNumberSubstraction, setSecondNumberSubstraction] = useState("")

    const handleAddition = (e) => {
        e.preventDefault()  ;
        additionPost(firstNumberAddition, secondNumberAddition).then((response) => response.json()).then(data => setAddition(data)) ;
    }

    const handleSubstraction = (e) => {
        e.preventDefault()  ;
        substractionPost(firstNumberSubstraction, secondNumberSubstraction).then((response) => response.json()).then(data => setSubstraction(data)) ;
    }

    return (
        <div>
            <form align="center" onSubmit={handleAddition}>
                <label>One</label>
                <input type={"number"} value={firstNumberAddition} onChange={e => setFirstNumberAddition(e.target.value)}></input>
                <label>Two</label>
                <input  type={"number"} value={secondNumberAddition} onChange={e => setSecondNumberAddition(e.target.value)}></input>
                <input type={"submit"} value={"Additionne"}></input>
            </form>
            <p align="center">{addition}</p>

            <form align="center" onSubmit={handleSubstraction}>
                <label>One</label>
                <input type={"number"} value={firstNumberSubstraction} onChange={e => setFirstNumberSubstraction(e.target.value)}></input>
                <label>Two</label>
                <input  type={"number"} value={secondNumberSubstraction} onChange={e => setSecondNumberSubstraction(e.target.value)}></input>
                <input type={"submit"} value={"Soustrait"}></input>
            </form>
            <p align="center">{substraction}</p>
        </div>
    )
}

export default Main ;