
## What is a Shared Library in Jenkins?

A shared library in Jenkins is a collection of Groovy scripts shared between different Jenkins jobs. To run the scripts, they are pulled into a Jenkinsfile.

Each shared library requires users to define a name and a method of retrieving source code. These methods include local files, Git repositories, and Jenkins SCM plugins. Optionally, users can also set a default library version.


## Use case

Shared Libraries marked Load implicitly allows Pipelines to immediately use classes or global variables defined by any such libraries. To access other shared libraries, the Jenkinsfile needs to use the @Library annotation, specifying the library’s name:

![image](https://user-images.githubusercontent.com/59709429/182849480-fc35f493-3bc7-485e-9bdd-01e0b88a5b6d.png)


Configuring a Global Pipeline Library
@Library('my-shared-library') _
/* Using a version specifier, such as branch, tag, etc */
@Library('my-shared-library@1.0') _
/* Accessing multiple libraries with one statement */
@Library(['my-shared-library', 'otherlib@abc1234']) _
