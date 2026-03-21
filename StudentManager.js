import React, { useState } from "react";
import "./StudentManager.css";

function StudentManager() {

  const [students, setStudents] = useState([
    { id: 1, name: "Rahul", course: "CSE" },
    { id: 2, name: "Anita", course: "ECE" },
    { id: 3, name: "Kiran", course: "IT" },
    { id: 4, name: "Sneha", course: "MECH" },
    { id: 5, name: "Arjun", course: "CIVIL" }
  ]);

  return (
    <div>
      <h2>Student Manager</h2>
    </div>
  );
}

export default StudentManager;