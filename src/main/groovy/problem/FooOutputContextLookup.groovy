package problem

import org.grails.taglib.encoder.OutputContext
import org.grails.taglib.encoder.OutputContextLookup

class FooOutputContextLookup implements OutputContextLookup{
    @Override
    OutputContext lookupOutputContext() {
        return null
    }
}
