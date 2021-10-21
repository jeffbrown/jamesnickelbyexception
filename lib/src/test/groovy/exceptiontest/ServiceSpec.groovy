package exceptiontest

import spock.lang.Shared
import spock.lang.Specification

class ServiceSpec extends Specification {
    @Shared
    SomeService service = new SomeService()

    def "test something"() {
        when:
        boolean result = service.emitError(new Exception('Hello World'))

        then:
        result

        when:
        result = service.emitError(new Exception('Goodbye World'))

        then:
        !result
    }
}
