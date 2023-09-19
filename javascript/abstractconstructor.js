// Abstract constructor function
function AbstractClass() {
    if (this.constructor === AbstractClass) {
        throw new Error("Cannot instantiate abstract class.");
    }
}

// Abstract method
AbstractClass.prototype.abstractMethod = function() {
    throw new Error("Abstract method must be overridden.");
};

// Derived class constructor function
function DerivedClass() {
    AbstractClass.call(this); // Call the parent constructor
}

// Inherit from AbstractClass
DerivedClass.prototype = Object.create(AbstractClass.prototype);
DerivedClass.prototype.constructor = DerivedClass; // Set the constructor properly

// Override the abstract method
DerivedClass.prototype.abstractMethod = function() {
    console.log("DerivedClass's implementation of abstractMethod.");
};

// Usage
const instance = new DerivedClass();
instance.abstractMethod(); // Output: "DerivedClass's implementation of abstractMethod."
