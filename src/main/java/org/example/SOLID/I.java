package org.example.SOLID;

public class I {
    // If it aint needed, yeet it

    interface Gun {
        void scopeIn();
        void reload();
    } // WHAT ABOUT REVOLVER? SCOPE???


    // Should be:
    interface Gun {
        void reload();
    }

    interface Scope {
        void scopeIn();
    }
}
