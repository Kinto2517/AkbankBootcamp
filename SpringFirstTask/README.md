<h3 align="center">Connect with me</h3>

<div style="margin-top:10px" align="center">
  <div>
     <a href="https://kinto2517.github.io" target="blank"><img src="https://img.shields.io/badge/website-000000?style=for-the-badge&logo=About.me&logoColor=white" alt="aboutme"/></a>
     <a  href="https://linkedin.com/in/ersinya" target="_blank">
      <img src="https://img.shields.io/badge/Linked%20In-0A66C2.svg?style=for-the-badge&logo=linkedin&logoColor=white" alt="linkedin"/>
    </a>
    <a  href="https://www.hackerrank.com/ersin_yilmaz2517?hr_r=1" target="_blank">
      <img src="https://img.shields.io/badge/-Hackerrank-2EC866?style=for-the-badge&logo=HackerRank&logoColor=white" alt="hackerrank"/>
    </a>
    <a  href="https://github.com/Kinto2517" target="_blank">
      <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="github"/>
    </a>
     <a href="https://codepen.io/kinto2517" target="_blank">
      <img src="https://img.shields.io/badge/Codepen-000000.svg?style=for-the-badge&logo=codepen&logoColor=white" alt="codepen"/>
    </a>

  </div>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This project involves building a simple API for managing countries and their presidents. The API should allow users to perform basic CRUD operations (create, read, update, delete) on countries and their presidents.

The data model for this API includes three fields: ID, name, and president. Each country is identified by a unique ID, and has a name and a president associated with it.

To create the API, we will use the Spring framework and Mapstruct for data mapping. We will not use a database for this project, instead we will use in-memory data structures to store the data.

The API will include the following endpoints:

- Save a country (POST /countries)
- Get all countries (GET /countries)
- Get a country by ID (GET /countries/{id})
- Update a country's president (PUT /countries/{id}/president)

By using Mapstruct, we will ensure that the API returns DTOs (Data Transfer Objects) instead of entity objects. This will help to decouple the API's data model from the underlying data storage mechanism.

In summary, this project aims to provide a simple example of building a RESTful API using Spring and Mapstruct, with a focus on separation of concerns and clean code.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

[![Spring][Spring]][Spring-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

This project is intended to be used as a reference for building RESTful APIs using Spring and Mapstruct. It can also be used as a starting point for building more complex APIs.

Get all countries
![img.png](img.png)

Add a country
![img_1.png](img_1.png)

Update a country's president
![img_2.png](img_2.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [x] Add Responses
- [x] Add Mapstruct
- [ ] Add Additional HTTP Methods
- [ ] Add Swagger
- [ ] Add More Endpoints

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/SpringBoot`)
3. Commit your Changes (`git commit -m 'Add some feature about Spring Boot'`)
4. Push to the Branch (`git push origin feature/SpringBoot`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Ersin Yılmaz ASLAN - [My Website](https://kinto2517.github.io) - ersin.yilmaz2517@gmail.com

Project Link: [https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-Kinto2517](https://github.com/Akbank-Patika-dev-Java-Spring-Bootcamp/homework-1-Kinto2517)

<p align="right">(<a href="#readme-top">back to top</a>)</p>





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[Spring]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/
