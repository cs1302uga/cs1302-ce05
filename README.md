# ce05 API Documentation with Javadoc

This class exercise is designed to get you aquainted Javadoc comments and interfaces.

## Prerequisite Knowledge

* A basic understanding of Javadoc tags and generating API documentation.
* https://github.com/cs1302uga/cs1302-tutorials/blob/master/javadoc/javadoc.md

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
   a Java file somewhere in the directory structure. For the `.java` file, write the path relative
   to the `cs1302-ce05` directory and the fully qualified name of the class.

1. Make sure you are still in the `cs1302-ce05` directory. Write the command to generate 
   the API documentation website for the code contained in this exercise and place it in the `doc`
   subdirectory. Be sure to write the full command in your notes.

1. Verify that files were generated and placed in the `doc` directory before continuing.
   What do the `-d`, `-sourcepath`, and `-subpackages` options mean?

1. Verify that you have a `public_html` directory in your home directory. What commands did you
   type to check this? If the `~/public_html` directory does not exist, then you should create
   it. The purpose of this directory on Nike is to support student websites, which will be
   illustrated in the following steps. 

   **NOTE:** You are fully responsible for anything that you host through your Nike website.

1. Use `ln` to create a symbolic link (shortcut) named `cs1302-ce05-doc` in your `public_html` 
   directory. The symbolic link should link to the `doc` subdirectory containing the API documentation 
   website created in a previous step. Write the exact command used in your notes. 
   
1. The symbolic link created in the last step is called `cs1302-ce05-doc`. You can see it if you
   change into your `public_html` directory and perform an `ls -l`. What are two things in
   the output of `ls -l` that let you know `cs1302-ce05-doc` is a symbolic link?

1. Navigate to the following URL in your web browser, replacing `user` with your Nike
   username:

   ```
   http://cs.uga.edu/~user/cs1302-ce05-doc/
   ```

   You should see the API documentation website that you generated. Does this website look 
   similar to any other websites that you may have visited? If so, what? You can be general 
   in your response.

**CHECKPOINT**
    
### Writing API Documentation

1. From the API documentation website, click on one of the links to the `House` class. How many 
   methods currently contain Javadoc comments?
   
1. In `House.java`, add Javadoc comments for each undocumented method. In each of your comments, 
   include a sentence that describes the method, along with tags that document, as needed, the 
   parameters and return type. Leave out any propagated exceptions for now. 
   Use the @code tag where appropriate in your description.

1. Run the `javadoc` tool to update your API documentation website on `nike`.

**CHECKPOINT**

### Throwing Exceptions

1. To ensure that a `House` object cannot have a negative price, modify the constructor and the
   `setPrice` method to throw an exception when `price` is negative.
   
1. Update the Javadoc comments with the appropriate `@throws` tags if you haven't done so already.

1. Run the `javadoc` tool to update your API documentation website on `nike`.

**CHECKPOINT**
    
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
