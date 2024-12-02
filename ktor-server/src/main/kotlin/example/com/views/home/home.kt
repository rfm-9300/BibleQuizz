package example.com.views.home

import example.com.views.layout.layout
import example.com.views.navbar.navbar
import kotlinx.html.*

fun HTML.homePage() {
    layout {
        div(classes = "max-w-4xl mx-auto px-4 py-8") {
            navbar()
            // Header section
            div(classes = "flex justify-between items-center mb-8") {
                div {
                    h1(classes = "text-3xl font-bold") { +"Active Hive Events" }
                    p(classes = "text-gray-600 mt-2") { +"Upcoming community gatherings and workshops" }
                }

                // CTA Button
                button(classes = "bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600 transition") {
                    +"Create Event"
                }
            }

            // Filters
            div(classes = "flex space-x-4 mb-6") {
                select(classes = "border rounded px-3 py-2") {
                option { +"All Categories" }
                option { +"Workshops" }
                option { +"Meetups" }
                option { +"Conferences" }
            }

                select(classes = "border rounded px-3 py-2") {
                option { +"Upcoming" }
                option { +"Past Events" }
            }
            }

            // Event List
            div {
                // Event Card 1
                div(classes = "border rounded-lg p-6 mb-4 flex hover:shadow-md transition") {
                // Date Box
                div(classes = "flex flex-col items-center justify-center mr-6 bg-gray-100 p-4 rounded") {
                span(classes = "text-2xl font-bold text-blue-600") { +"15" }
                span(classes = "text-sm text-gray-500") { +"Dec" }
            }

                // Event Details
                div(classes = "flex-grow") {
                h2(classes = "text-xl font-semibold mb-2") { +"Web3 Developer Hackathon" }
                p(classes = "text-gray-600 mb-2") { +"Join our annual hackathon and build innovative blockchain solutions" }

                div(classes = "flex items-center space-x-4 text-sm text-gray-500") {
                span { +"🕒 10:00 AM" }
                span { +"📍 Online" }
            }
            }

                // Registration Button
                button(classes = "bg-green-500 text-white px-4 py-2 rounded hover:bg-green-600 self-center") {
                +"Register"
            }
            }

                // More event cards can be added similarly...
            }

            // Pagination
            div(classes = "flex justify-center space-x-2 mt-6") {
            button(classes = "px-4 py-2 border rounded hover:bg-gray-100") { +"Previous" }
            button(classes = "px-4 py-2 border rounded hover:bg-gray-100") { +"Next" }
        }
        }
    }
}