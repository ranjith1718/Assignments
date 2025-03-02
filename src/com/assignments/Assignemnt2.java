package com.assignments;

public class Assignemnt2 {

	public static void main(String[] args) {
		String[][][] data = {
				{ { "Mathematics", "Physics", "Chemistry", "Computer Programming", "Engineering", "Basic Eletrical" },
						{ "78", "85", "91", "74", "88", "79" } },
				{ { "Mathematic", "Mechanics", "Envirnemnt", "Basic electronic", "Enginerring Physic", "Graphics" },
						{ "82", "77", "93", "69", "84", "90" } },
				{ { "Data Structure", "Discrete mathematic", "digital Eletronics", "Operating Systens",
						"Signal and Systems", "Object oriented prog" }, { "67", "68", "53", "79", "84", "80" } },
				{ { "Algorithms", "Computer network", "database systems", "microprocessor", "Communication engineer",
						"Software engineering" }, { "79", "84", "80", "77", "93", "69" } },
				{ { "Probability", "Machine Learening", "Compiler Design", "Theory of Computation", "Embedded Systems",
						" Computer Graphics" }, { "77", "93", "69", "74", "88" } } };
		System.out.println("Semester 3, Subject 4: " + data[2][0][3]); // Operating Systems
		System.out.println("Semester 3, Subject 5: " + data[2][0][4]); // Signals
	}
}
