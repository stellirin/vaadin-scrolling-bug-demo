package com.jll.wmh.application.portal

import com.example.demo.vaadin.MainView
import com.github.mvysny.karibudsl.v10.*
import com.github.mvysny.karibudsl.v23.route
import com.github.mvysny.karibudsl.v23.sideNav
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.FlexLayout

class MainLayout : AppLayout() {

	init {

		navbar {
			drawerToggle()
			h3("Vaadin: Demo")
		}

		drawer {

			flexLayout {
				setHeightFull()
				flexDirection = FlexLayout.FlexDirection.COLUMN
				justifyContentMode = FlexComponent.JustifyContentMode.BETWEEN

				flexLayout {
					flexDirection = FlexLayout.FlexDirection.COLUMN

					sideNav("Home") {
						route(MainView::class, VaadinIcon.HOME, "Welcome")
					}
				}
			}
		}
	}
}
