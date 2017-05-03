package steps

import cucumber.api.PendingException
import org.apache.tools.ant.taskdefs.WaitFor
import pages.*
import sistemadevagasdeestacionamento.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

//################### CONTROLLER ###################
Given(~/^The system has stored the user "([^"]*)" with preference parking spaces in the "([^"]*)" sector$/) { ->

}

And(~/^The problem report list has the problem with title "([^"]*)", sector "([^"]*)" and description "([^"]*)"$/) { ->

}

And(~/^The user logged in the system as "([^"]*)"$/) { ->

}

When(~/^The user try to set as solved the problem "([^"]*)"$/) {  ->
}

Then(~/^The problem "([^"]*)" is not modified$/) {  ->
}

Then(~/^The problem "([^"]*)" is removed from parking report list$/) {  ->
}


//################### GUI ###################
Given(~/^I signed up as "([^"]*)" with preference parking spaces in the "([^"]*)" sector$/) {  ->
}

When(~/^I go to parking report list page$/) { ->

}

And(~/^I see problem "([^"]*)" in parkin report list$/) {  ->

}

And(~/^I select the option to set the problem "([^"]*)" as solved$/) { String title ->
}

Then(~/^I can not see the problem "([^"]*)" in the parking problem list$/) { String title ->
}

Then(~/^I see the problem "([^"]*)" continues in the parking report list$/) { String title ->

}
And(~/^I sent a problem with title "([^"]*)", sector "([^"]*)" and description "([^"]*)"$/) { String title, String sector, String description ->

}
Given(~/^I signed up as "([^"]*)" with preference for parking spaces in the "([^"]*)" sector$/) { String arg1, String arg2 ->

}