import Header from "./Header";
import { render, screen } from "@testing-library/react";

describe("header tests", () => {
    it("test h1", () => {
        render(<Header/>)

        const textBox = screen.getByText("Examen Intra");

        expect(textBox).toBeInTheDocument() ;
    })

    it("test h2", () => {
        render(<Header/>)

        const textBox = screen.getByText("Calculatrice Web");

        expect(textBox).toBeInTheDocument() ;
    })
}) ;