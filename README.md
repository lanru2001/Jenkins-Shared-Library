## Use case

Shared Libraries marked Load implicitly allows Pipelines to immediately use classes or global variables defined by any such libraries. To access other shared libraries, the Jenkinsfile needs to use the @Library annotation, specifying the library’s name:

![image](https://user-images.githubusercontent.com/59709429/182849480-fc35f493-3bc7-485e-9bdd-01e0b88a5b6d.png)




Configuring a Global Pipeline Library
@Library('my-shared-library') _
/* Using a version specifier, such as branch, tag, etc */
@Library('my-shared-library@1.0') _
/* Accessing multiple libraries with one statement */
@Library(['my-shared-library', 'otherlib@abc1234']) _
