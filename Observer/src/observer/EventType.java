package observer;

// An enum(used for type safety) listing the different types of events our system can notify observers about.
public enum EventType {

    PRICE_CHANGE,
    DIVIDEND_ANNOUNCEMENT
    
}



// ENUMS are type-safe : The set of allowed values is locked in, and the compiler keeps you from using anything outside of it. 