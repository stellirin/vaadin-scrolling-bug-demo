package com.example.demo.vaadin

import com.github.mvysny.karibudsl.v10.h1
import com.github.mvysny.karibudsl.v10.p
import com.vaadin.flow.component.formlayout.FormLayout
import java.util.*

class MainViewForm : FormLayout() {
	init {
		for (i in 0..20) {
			h1("${i}: ${UUID.randomUUID()}") {
				setColspan(this, 2)
			}
			p("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.") {
				setColspan(this, 2)
			}
		}
	}
}
