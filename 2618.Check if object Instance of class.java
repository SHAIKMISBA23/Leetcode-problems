
var checkIfInstanceOf = function(obj, classFunction) {
    if (obj === null || obj === undefined || typeof classFunction !== "function") {
        return false;
    }
    if (typeof obj !== "object" && typeof obj !== "function") {
        obj = Object(obj);
    }

    return obj instanceof classFunction;
};
