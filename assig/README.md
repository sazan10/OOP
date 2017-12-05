## Library Management System


### Instructions
	- This is a simple library project, which stores records in JSON format in a file and using GSON the data has been retrieved as objects.TEmphasizing CRUD the basic functionalities of the project are:
	- New book records can be added with their title, publisher, author, and id provided by user
	- The record as a whole can be read
	- The record can be updated as per the Title of the book
	- The record can be deleted as per the Title of the book 
	- For CRUD, classes Creation, Read, Updater and Deleter has been created
	- The Creation class contains create method which is abstract and extended in both deleter and updater as both have to access the create method
	- For the Creation class the create method is abstract so in order to create new record it accesses the method from child Updater using polymorphism
	- The Input class is an interface and implemented by class Create and Updater to get values for either new record or existing record to update
