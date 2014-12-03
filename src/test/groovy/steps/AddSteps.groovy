package steps

import groovy.transform.Field
import app.JavaAdder
import app.GroovyAdder

this.metaClass.mixin(cucumber.api.groovy.EN)

@Field adder
@Field result

Given(~/^I have a Java based adder$/) { ->
    adder = new JavaAdder()
}

Given(~/^I have a Groovy based adder$/) { ->
	adder = new GroovyAdder()
}

When(~/^I add (\d+) and (\d+)$/) { int x, int y ->
   result=adder.add(x,y)	
}

Then(~/^I get (\d+)$/) { int expected ->
	assert result==expected
}