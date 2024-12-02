package com.example.demo.vaadin

import com.github.mvysny.karibudsl.v10.KComposite
import com.github.mvysny.karibudsl.v10.horizontalLayout
import com.github.mvysny.karibudsl.v10.verticalLayout
import com.jll.wmh.application.portal.MainLayout
import com.vaadin.flow.component.formlayout.FormLayout
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import jakarta.annotation.security.PermitAll

@PermitAll
@PageTitle("Home | Vaadin: Demo")
@Route(value = "", layout = MainLayout::class)
class MainView : KComposite() {

	private lateinit var form: MainViewForm

	private val root: VerticalLayout = ui {
		verticalLayout {
			setSizeFull()

			horizontalLayout {
				setSizeFull()
				justifyContentMode = FlexComponent.JustifyContentMode.CENTER

				form = MainViewForm().apply {
					maxWidth = "1024px"

					responsiveSteps = listOf(
						FormLayout.ResponsiveStep("0", 1),
						FormLayout.ResponsiveStep("500px", 2),
					)

				}.also { this.add(it) }
			}
		}
	}

}
