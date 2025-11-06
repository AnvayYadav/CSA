---
layout: base 
title: College Board Practice MCQ 1
description: My reflection from the first College Board Practice MCQ we did for Trimester 1 final.
permalink: /CollegeBoardPracticeMCQ1
---

### My approach to taking the MCQ

- Start of going through the questions in order.
- Use the strikethrough feature for answer choices that seem implausible(ex: array size exceeds dimensions)
- For questions involving iteration map out each iteration in my head with its input and output
- For string manipulation questions, track the string state after each substring or modification operation
- Questions that I find myself stuck on for too long are marked for review
- Upon Completion of all questions I can answer, go back to marked questions
- Try to reanswer them, factoring in some of the logic in other questions I answered
- Last resort: guessing from the answer choices that aren't obviously wrong.

### Score and Overall

<img width="1461" height="321" alt="Image" src="https://github.com/user-attachments/assets/f9b583d9-11fd-447d-941a-1fbef6ecd1bf" />

I'm happy with my score, and believe the team teaches built a solid foundation of Java concepts in me. However, what I'm lacking is efficiency. I spent about two hours on the MCQ, 30 minutes over the CB standards. This stems from my inability to instantly grasp the logic behind the code given in the scenario. I aim to work on this simply through practice under harsh time conditions.

### Questions Corrections 

<img width="976" height="666" alt="Image" src="https://github.com/user-attachments/assets/b2845949-060d-485d-bb6d-9dc57e3a6acc" />

Right answer procedure:

- Trace the outer loop: outer = 0, 1, 2, 3, 4 (5 iterations)
- For each outer iteration, trace the inner loop: inner = 4, 3, 2, 1, 0 (5 iterations each time)
- The print statement executes: 5 outer × 5 inner = 25 times
- inner >= 0 means the loop runs when inner equals 0 too, so it's 5 iterations

My mistake:
My mistake was not carefully tracking that the condition >= 0 includes 0 itself.

<img width="964" height="727" alt="Image" src="https://github.com/user-attachments/assets/6f047cc7-a0ce-4703-938e-37dd4c5b52d0" />

The string is "abbcdddeff". So when I trace through comparing adjacent characters the bb, dd, dd, and ff will yield an answer of 4. I glossed over there being 3 d's.

<img width="949" height="752" alt="Image" src="https://github.com/user-attachments/assets/27d303a5-b8fa-4323-91d1-be5fc518b582" />

Right Answer Procedure:
Start with int[4][3] → 4 rows, 3 columns, all initialized to 0.

The condition if (r == c) only triggers on diagonal positions:

r=0, c=0: my2Darr[0][0] = 0

r=1, c=1: my2Darr[1][1] = 1

r=2, c=2: my2Darr[2][2] = 2

r=3: no c=3 exists (columns only go 0-2)

I misunderstood the r == c condition, and was confused dealing with 2d arrays. Didn't recognize r == c specifically targets only the main diagonal elements where the row index equals column index.

### Other Corrections:

<img width="837" height="699" alt="Image" src="https://github.com/user-attachments/assets/237e37ed-91b4-4153-92e9-3241f004a75a" />

Right answer:
Start: str = "lookout", target = "o", j = 1 (first 'o')

Iteration 1: Print str.substring(1) → "ookout ", then str = str.substring(1) → "ookout", then j = str.indexOf("o") → j = 0

Iteration 2: Print str.substring(0) → "okout ", then str = str.substring(1) → "okout", then j = str.indexOf("o") → j = 0

Iteration 3: Print str.substring(0) → "out ", then str = str.substring(1) → "kout", then j = str.indexOf("o") → j = -1

Mistake:
I didn't trace through enough iterations. The loop continues as long as j >= 0, which happens three times total, not just two. 

<img width="973" height="735" alt="Image" src="https://github.com/user-attachments/assets/a141d087-9b36-47e0-9a37-c7ce162ba501" />


Right answer:

Arrays are passed by reference, so modifications persist. 

Start: {0, 0, 0, 0}. 

First call sets numArr[1] = 1 → {0, 1, 0, 0}. 

Second call sets numArr[3] = 3 → {0, 1, 0, 3}.

<img width="959" height="724" alt="Image" src="https://github.com/user-attachments/assets/f316fae1-4254-4ac3-8737-4fe471067f97" />

Right answer:

Array: {10, 10, 10, 20, 20, 30, 40, 50, 50, 60, 80}, Target: 10

Call 1: low=0, high=10, mid=5, elements[5]=30, 10<30 → search left (0,4)

Call 2: low=0, high=4, mid=2, elements[2]=10 → Match found, return 2

### Concepts I Need to Improve:


- Loop iteration counting, as I'm making off-by-one errors with boundary conditions like >= 0 and not systematically tracing nested loops (outer × inner iterations)
- String manipulation and indexing, as I'm losing track of how strings change after substring() operations and not tracing enough loop iterations when indexOf() keeps finding matches
- 2D array traversal patterns, as I'm misunderstanding diagonal conditions like r == c and need to visualize array grids to track which positions get modified
- Pass-by-reference for arrays, as I'm confusing array indices with values and not recognizing that array modifications inside methods persist to the original array
- Binary search midpoint calculations, as I'm miscalculating (low + high) / 2 with integer division and not carefully tracing recursive calls with updated parameters
- Adjacent element comparison loops, as I'm miscounting consecutive duplicate pairs when multiple identical elements appear in sequence

### Concepts I Did Good In:
- Object-oriented design principles, understanding encapsulation (private instance variables with public getter methods) and proper class structure
- Algorithm correctness and edge cases**: Identifying when initialization values cause failures with specific input ranges 
- Understanding Math.random() ranges and how to scale/shift to get desired integer ranges with casting
- Understanding static variables are shared across all class instances and tracking which constructors modify them
- Any Boolean Logic related questions
- Understanding how changing loop conditions affects when loops terminate and what values remain

Modified Approach For Taking MCQ:

- For questions involving iteration, write out each iteration on scratch paper with variable values rather than trying to trace in my head
- For 2D array questions, draw a quick grid showing rows and columns to visualize which positions are affected
- For binary search or recursive methods, write out each recursive call with updated parameters (low, mid, high)
- Double-check boundary conditions in every question they are present

