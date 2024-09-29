# Uriel's Web Development Portfolio

Welcome to my web development portfolio. This repository showcases several projects and webpages I've worked on, including a personal website with navigation, a skills page, a contact form, and links to some of my projects hosted on GitHub.

## Table of Contents
- [Homepage](#homepage)
- [Projects](#projects)
- [Skills](#skills)
- [Contact](#contact)
- [Technologies Used](#technologies-used)

## Homepage
The homepage introduces me and my aspirations as a backend developer. It includes navigation to different sections of my website and a brief description of my current studies and career goals.

- **Technologies**: HTML, CSS
- **Navigation Links**:
  - Home
  - Projects
  - Skills
  - Contact

## Projects
This section highlights three of my main projects, each with a description, images, and links to their GitHub repositories:

1. **Text File Compression**:
   - Description: A project focused on compressing and decompressing text files using custom algorithms.
   - Technologies Used: C++, Huffman Encoding
   - [View Project on GitHub](https://github.com/Edmzzz/portfolio_webdev/tree/ba874a9a4611c7ca36e5bc2afbe010b90f3d9d65/Text%20File%20Compression)

2. **Login and Signup System**:
   - Description: A login and signup system that allows users to register, sign in, and update their account details.
   - Technologies Used: Java, MySQL
   - [View Project on GitHub](https://github.com/Edmzzz/portfolio_webdev/tree/ba874a9a4611c7ca36e5bc2afbe010b90f3d9d65/Login%20and%20Registration%20System)

3. **Point of Sales (POS) System**:
   - Description: A Point of Sales system for managing sales, inventory, and transactions.
   - Technologies Used: C++
   - [View Project on GitHub](https://github.com/Edmzzz/portfolio_webdev/tree/ba874a9a4611c7ca36e5bc2afbe010b90f3d9d65/Point%20of%20Sales)

## Skills
This section showcases my proficiency in various technologies. My skills are displayed in a table format, with a focus on beginner-level web development languages.

| Skill       | Proficiency Level |
|-------------|-------------------|
| C           | Beginner          |
| C++         | Beginner          |
| Java        | Beginner          |
| PHP         | Beginner          |
| HTML        | Beginner          |
| CSS         | Beginner          |
| JavaScript  | Beginner          |

## Contact
The contact page includes links to my social media profiles and a simple contact form that allows visitors to send messages directly to my email.

- **Social Media Links**:
  - [Facebook](https://web.facebook.com/yurieyel)
  - [GitHub](https://github.com/Edmzzz)
  - [LinkedIn](https://www.linkedin.com/in/uriel-papa-6a6244244/)
  
- **Technologies**: HTML (for the contact form), Mailto method for sending messages.

### Example Contact Form
```html
<form action="mailto:urielpapa26@gmail.com" method="POST" enctype="text/plain">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required size="30"><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" required size="30"><br><br>

    <label for="message">Message:</label><br>
    <textarea id="message" name="message" rows="5" cols="33" required></textarea><br><br>

    <button type="submit">Send</button>
</form>
