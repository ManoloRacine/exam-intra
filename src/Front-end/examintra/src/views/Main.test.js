import { render, screen } from "@testing-library/react";
import Main from './Main';
import React from "react";

describe("operations tests", () => {
    it("test addition", () => {
        render(<Main/>)

        const textBox = screen.getByText("pas encore d'addition");

        expect(textBox).toBeInTheDocument() ;
    })

    it("test soustraction", () => {
        render(<Main/>)

        const textBox = screen.getByText("pas encore de soustraction");

        expect(textBox).toBeInTheDocument() ;
    })

    it("test input numbers", () => {
        render(<Main/>)

        const inputs = screen.getAllByRole("spinbutton")

        expect(inputs).toHaveLength(4)
    })

    it("test input numbers", () => {
        render(<Main/>)

        const inputs = screen.getAllByRole("spinbutton") //le role pour les inputs avec type=number

        expect(inputs).toHaveLength(4)
    })

    it("test input submit", () => {
        render(<Main/>)

        const inputs = screen.getAllByRole("button") //le role pour les inputs avec type=submit

        expect(inputs).toHaveLength(2)
    })
}) ;