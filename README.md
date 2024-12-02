# vaadin-scrolling-bug-demo

To reproduce the bug, run the app and open the browser. Scroll the page and you will see the page turn blank.

In `settings.gradle.kts` vaadin is set to version `24.4.15`, but the bug also reproduces on versions `24.4.19`,
`24.5.7`, and `24.6.0.beta1`.

After downgrade to `24.4.14` the bug is gone.
