Feature: Accounts creation in leaftaps

Scenario Outline: Login valid Credentials
And Enter the us as <username>
And Enter the pwd as <password>
When Click on login button
Then Home Page should be displayed
When click on CRMSFAhome button
Then myhomepage should be displayed
Given click on accounts button
And click on create account button
And enter the account name as <name>
When click on create button
Then Createaccount page should be displayed
Given click on the edit button
And edit the name in the account name button <Rename>
When click on the save button
Then Account details page should be displayed
When click on the Deactivate button 
Given click on the ok button in the popup
Then print the deactivate message
Examples:
|username|password|name|Rename|
|'Demosalesmanager'|'crmsfa'|'sushant'|'velu'|