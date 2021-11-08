
# Reminder App
fiyinfoluwa
Tamajong 
Zion

## Table of Contents
1. [Overview](#Overview)
3. [Product Spec](#Product-Spec)
4. [Wireframes](#Wireframes)
5. [Schema](#Schema)

## Overview
Its an app that reminds the user about any number of tasks they need to do during the day.
### Description
The app will connect to parse to allow users to login to an account where they can view their tasks for the day and also set up a new list of tasks for another date.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Alarm
- **Mobile:** App will allow users to view and edit lists.
- **Story:** Helps users keep up with day to day tasks by reminding them of what needs to be done every day.
- **Market:** Anyone that has trouble keeping up with day to day tasks or is very busy.
- **Habit:** Users can always set up lists, view the list of tasks for the current day, and edit lists for future dates.
- **Scope:** The scope is very narrow as the app will only perform a few tasks designed to assist users throughout their day.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User is able to succesfully sign in
* User is able to view current list of tasks
* User is able to create list of tasks for future dates
**Optional Nice-to-have Stories**

* ...

### 2. Screen Archetypes

* Sign in screen
   * User is able to sign in
* Current list
   * User is able to view current list of tasks
* New list
    * User is able to create new list of tasks

### 3. Navigation

**Flow Navigation** (Screen to Screen)
* Sign in screen
    * Current list
* Current list
    * New list
* New list

## Wireframes
<img src="https://i.imgur.com/4FwqSlI.jpg
" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 

### Models

###List

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | List         | Array    | list of objects set by user | 
   | Username      | Pointer to user   | list author |
   | Password     | String    | unique code to allow user to access account |
   | Date        | DateTime      | date when list is set to remind user|
   
### Networking
- Login
  - (Read/GET) Read input to see if it matches login credentials
- Home Screen
  - (Read/GET) Display lists for current and future dates
  - (Update/PUT) Change contents of future lists
  - (Create/POST) Make new list
- New list screen
  - (Create/POST) Make new list to be displayed on home screen


###Update 11/8

-login screen has been added
