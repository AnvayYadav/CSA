---
layout: base 
title: Cool Trimester 1 Contributions
description: Contributions from Sprint 3 in Trimester 1.
permalink: /coolcontributions
---

### Sprint 3 Submodule work

[Commit1](https://github.com/ApplicatorsCSA/pages/commit/6dc45f6b6d19d421c8ce708f147c840b3ac95bb4)
[Commit2](https://github.com/ApplicatorsCSA/pages/commit/58d64ae6f323e91bc587ce5ec4b090b3b1dfd3c0)

<img width="806" height="604" alt="Image" src="https://github.com/user-attachments/assets/fb4cd1fd-ad46-4f33-8368-6cd07cafd9c6" />

This function implements the core search functionality that allows users to filter a dataset by multiple optional criteria simultaneously. When a user enters values in any combination of the four search fields (location, industry, minimum experience, skill), the function filters the users array using JavaScript's .filter() method with compound boolean logic. Each condition is only applied if the user provided input for that field, creating a flexible search experience. The function uses case-insensitive string matching (.toLowerCase()) for location and industry, numeric comparison for the experience threshold, and array searching with .some() and .includes() for skills. After filtering, it resets pagination to page 0 and calls renderResults() to display the filtered data.

<img width="527" height="664" alt="Image" src="https://github.com/user-attachments/assets/242ef0eb-dc4f-4fdd-bc7d-d6b20100a73a" /> 

What it does:
This function translates user-selected checkboxes and form inputs into actual Spring Data JPQL query syntax in real-time. It's an educational tool that demonstrates how backend queries are constructed. As users check boxes (useLocation, useIndustry, useSkill) and fill corresponding input fields, the function conditionally builds two arrays: parts[] for WHERE clause fragments and params[] for named parameters. For example, if the location checkbox is checked and has a value, it adds "u.location = :location" to the parts array and location="${loc}" to the params array. The output displays both the complete JPQL query (SELECT u FROM User u WHERE ${where}) and the equivalent Spring Data Specification chain syntax (Specification.where(spec1()).and(spec2())), teaching students how frontend filters map to backend code.

<img width="916" height="511" alt="Image" src="https://github.com/user-attachments/assets/d6a52a0a-cb2e-44db-9938-5d2e009c2faf" /> 

What it does:
This function grades a multiple-choice quiz by comparing user selections (stored in the selections object) against correct answers stored in the quiz array. It loops through each question, applies CSS classes ("correct" in green, "incorrect" in red) to visually highlight results using DOM manipulation, calculates the total score and percentage, and displays explanations for each question. The visual feedback is immediate—no page reload required. The function uses querySelectorAll() to find all quiz option elements by their data-q attribute (question index), then adds/removes CSS classes based on whether the user's selection matches the correct answer index. After grading, it generates an HTML summary showing the score as both a fraction and percentage, followed by explanation text for each question pulled from the quiz[idx].expl property.


### Sprint 3 Microblog work

<img width="884" height="600" alt="Image" src="https://github.com/user-attachments/assets/2f30d453-2ee4-492e-a19b-c81a65c724dd" />

The committed code adds backend support for managing emoji reactions on microblog posts. It introduces helper methods that safely retrieve and count reactions (get_reactions, get_reaction_counts), check if a specific user has already reacted (user_has_reacted), and toggle reactions on or off (toggle_reaction). Together, these functions allow users to seamlessly add or remove emoji reactions on posts while keeping the stored JSON data consistent and preventing duplicates—essentially enabling a complete, reliable “like/react” system within the microblog model.

#### Postman Testing

<img width="891" height="688" alt="Image" src="https://github.com/user-attachments/assets/da22a0ab-cc2e-4eb2-9174-208e5700fa09" />

<img width="913" height="689" alt="Image" src="https://github.com/user-attachments/assets/f9ed95e2-f220-4841-95a6-53e1313a004d" />


### Brief Analytics

Mr Mortensen instructed use to keep track of our analytics from October 24th till Night at the Museum. As per his request, the below screenshots show my contributions to my teams repositories'.

<img width="1161" height="334" alt="Image" src="https://github.com/user-attachments/assets/dddb37a9-7fd3-428a-b9de-36517f207a03" />

<img width="1125" height="344" alt="Image" src="https://github.com/user-attachments/assets/c5ca7e43-779a-4108-8db6-48fdf30a3482" />

<img width="1127" height="327" alt="Image" src="https://github.com/user-attachments/assets/c2d53625-3053-41f4-9e2c-f2aa7c4934b5" />

<img width="1051" height="310" alt="Image" src="https://github.com/user-attachments/assets/f66b11ac-138c-4996-a55a-9df033bd9586" />

<img width="1124" height="314" alt="Image" src="https://github.com/user-attachments/assets/c8560e4f-5edb-4469-932d-92b726673536" />

### A grand total of 12 contributions in that time window.