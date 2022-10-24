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
}) ;