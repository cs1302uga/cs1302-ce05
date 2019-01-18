# ce05 TBD

This class exercise is designed to get you aquainted Javadoc comments and interfaces.

## Prerequisite Knowledge

* TODO
* TODO

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce05`:

   ```
   $ git clone https://github.com/cs1302uga/cs1302-ce05.git
   ```

1. Change into the `cs1302-ce05` directory that was just created and look around. There should be
   multiple Java files somewhere in the directory structure. For each `.java` file, fill out an
   entry in a table similar to the one provided below. Incldue the path of each file relative to 
   the `cs1302-ce05` directory, the fully qualified name of the class or interface contained in each
   ile, and a note indicating the type of thing declared in that file. 

   | Path                     | FQN        | Class or Interface? |
   |--------------------------|------------|---------------------|
   | `some/path/to/file.java` | `some.fqn` | Class               |

1. Make sure you are in the `cs1302-ce02`. Modify the command presented below to generate the API 
   documentation website for the code contained in this exercise and place it in the `doc`
   subdirectory. 

   ```
   $ javadoc -d doc -sourcepath src -subpackages .
   ```

   Be sure to verify that files were generated and placed in the `doc` directory before continuing. 

1. Verify that you have a `public_html` directory in your home directory. What commands did you
   type to check this? If the `~/public_html` directory does not exist, then you should create
   it. The purpose of this directory on Nike is to support student websites, which will be
   illustrated in the following steps. 

   **NOTE:** You are fully responsible for anything that you host through your Nike website.

1. Use `ln`, as described below, to create a symbolic link (shortcut) in your `public_html` 
   directory to the `doc` subdirectory containing the API documentation website that created in 
   a previous step. The exact command is presented below--it assumes you are currently in the 
   `cs1302-ce05` directory. 

   ```
   $ ln -s ~/public_html/cs1302-ce05-doc doc
   ```
   
   In this scenario, the symbolic link is called `cs1302-ce05-doc`. You can see it if you
   change into your `public_html` directory and perform an `ls -l`. What are two things in
   the output of `ls -l` that let you know `cs1302-ce05-doc` is a symbolic link?

1. Navigate to the following URL in your web browser, replacing `user` with your Nike
   username:

   ```
   http://cs.uga.edu/~user/cs1302-ce05-doc/
   ```

   Congratulations! If you followed the steps correctly, then you should see actual API
   documentation website that you generated. Does this website look similar to any other
   websites that you may have visited? If so, what? You can be general in your response.

**CHECKPOINT**
    
### SUBSECTION TITLE

1. TODO

**CHECKPOINT**
    
### SUBSECTION TITLE

1. TODO

**CHECKPOINT**
    
### SUBSECTION TITLE

1. TODO

**CHECKPOINT** 
    
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
