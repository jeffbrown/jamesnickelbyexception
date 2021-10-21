package exceptiontest

class SomeService {
    boolean emitError(Exception e) {
        e.message.contains 'Hello'
    }
}
