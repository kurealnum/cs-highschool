# Overview
Hi there! This is a school project that will likely be to the scale of my personal projects. Let me paste everything in the project description, so we can better understand what I'm talking about


For the remainder of this module, you will work on a summative, cumulative project as your Final Assessment for this course. Your capstone project will involve creating web applications around data sets. Throughout the remaining lessons, you will explore your data, create information hypotheses, build endpoints for an API, and create client applications that access your data and communicate it to users. In this lesson's assignment, you will set goals for your capstone project to help guide your work in the future.

### Choose a data set from the options below. Choose wisely! You will use this same dataset for the rest of the assignments in this course.

Environment Impact of Food Production (CSV)Download Environment Impact of Food Production (CSV)
Gapminder: Factors Predicting Global Warming (CSV) Download Gapminder: Factors Predicting Global Warming (CSV) 
International Greenhouse Gas Emissions (CSV) Download International Greenhouse Gas Emissions (CSV) 

### Next, set some goals for creating a web application that hosts an API (like the ones you built in Module 4):

What kind of data from your chosen dataset will your API provide?
Who do you imagine using your API?
What endpoints do you think you will need to create to serve your target audience?

### Finally, set goals for the application that you will create that access your web application, downloading data to use as part of its program. Here are some ideas for what kinds of client applications you might make:

Mild Difficulty: Create a chatbot that helps educate users about the data in your database, downloading data from from the API as needed and using it in complete sentences to help contextualize the information for the user.
Medium Difficulty: Create a Python Turtle program that draws data visualizations based on data served through your API endpoints
Medium Difficulty: Create a text-based adventure game that incorporates data from your API. Use normal Python print() and input() statements, or use the adventure-lib framework (via readthedocs.io).Links to an external site.
Spicy Difficulty: Use the pygame-zero to create a game that somehow incorporates data from your database. Be creative as you decide how a game might be based on the data you are serving through your API endpoints. You can view examples and documentation for pygame-zero here (via readthedocs.io).Links to an external site.

### 4. Set goals for your client application by answering the following questions:

What purpose will your client application serve?
Who do you imagine will use your client application?
How will your client application use data from your web application that you described in question 2?


Project Planning (below this ^^) should walk through everything listed above. I do need to make a secondary single file program that does one of the difficulties (and yeah, I know those are really weird). I'm probably going with the text-based adventure game, or the chatbot. It's not that I don't like the others, but I would rather focus on the API. Also, the dataset CSV is in this folder, if you want to see it.

# Project Planning
I'd like to use the dataset on International Greenhouse Gas emissions. My goal would be to make an API that follows the REST architectural style (a REST API), however I'm not sure if that's completely feasible/ideal for this assignment. If it is, the API needs to be:


Client-Server Separation: Keep the client and server separated, so you can scale each part individually

Stateless: I don't keep/store any SSIDs, or context between responses

Cacheable responses: Make the API able to cache responses, in order to improve performance

Layered System: Pretty much just keep the API separated into different layers, so it's easier to scale/modify in the future

Uniform Interface: Basically just build everything to generic standards, like using HTTP methods, HTTP status codes, URIs, ect.

 
All of this should be somewhat easy to do with Flask, and maybe a few other Flask extensions I've seen. If it proves too difficult or not ideal, no big deal. I can always just make a basic API.

Ideally, my API should provide all of the information from my dataset, including some routes to get information in a certain order, ex. getting countries in ascending order of the amount of CO2 emissions, and some routes to get more generic data points, like all countries listed in the dataset Finally, I could imagine really anyone using my API, maybe students like me in specific? Past that, I have no idea, and no target audience. 

In the scope of my client application, I haven't completely decided yet. I don't think I'm interested in doing something with pygame, neither do I want to do anything with turtle. I imagine that I'll end up either doing a text based adventure game, or a chatbot. They're relatively similar anyways.

I want my client application to be able to inform my users about the information in my dataset, and I can also imagine it serving as an educational game, maybe? That doesn't seem realistic, but it's my best idea at the moment. Finally, I think I'd like to use the data as almost a questionnaire/quiz, or maybe if I go the chatbot route, I can ask the user what they think about said data.

# TODO
Get all routes created

Make sure I'm returning the right information

Make sure/make the API compliant with REST architecture
-Figure out caching w/ Flask/Flask modules
-For HATEOAS (part of uniform interface), I just need to come back and provide references to related endpoints in my json returns
-That's really all I have to go out of my way to do
 