//#if($ReportParkingSpaceProblem)
package steps

import sistemadevagasdeestacionamento.AuthHelper
import sistemadevagasdeestacionamento.User
import sistemadevagasdeestacionamento.ProblemReport
import pages.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

//controller
Given(~/^the system has stored the user "([^"]*)" with "([^"]*)" as preferred sector$/) {  ->

}

And(~/^the user is logged in the system as "([^"]*)"$/) { ->
}

When(~/^the user tries to send the report with Title "([^"]*)", Sector "([^"]*)" and Description "([^"]*)"$/) { ->
}

When(~/^the user tries to send the report "([^"]*)" with some information left incomplete$/) { ->
}

Then(~/^the system stores the report "([^"]*)"$/){  ->
}

Then(~/^the system doesn't store the report "([^"]*)" with description "([^"]*)"$/) { ->
}

Then(~/^the system doesn't store the report "([^"]*)"$/) { ->
}

And(~/^The system has no problem report stored with Title "([^"]*)"$/) {  ->
}

And(~/^The system has a problem report stored with Title "([^"]*)"$/) {  ->

}
//gui

Given(~/^I signed up in the system as "([^"]*)" with "([^"]*)" as preferred sector$/) { ->
}

And(~/^I am at report parking space problem page$/){ ->

}

And(~/^I sent a report with Title "([^"]*)"$/){ ->
}

When(~/^I try to send a report with Title "([^"]*)", Sector "([^"]*)" and Description "([^"]*)"$/){ ->
}

When(~/^I try to send a report with some information left incomplete$/){ ->
}

Then(~/^I should see a message indicating that the report was created$/){ ->
}

Then(~/^I should see an error message$/){ ->

}


//#end
