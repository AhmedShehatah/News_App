# News_App

Simple news application

# Preview
<img src="https://user-images.githubusercontent.com/35743597/166115578-c64704fd-315b-4a8a-9fa6-2caf49575a99.jpg" width="300" height="600"/>  <img src="https://user-images.githubusercontent.com/35743597/166115582-38264b65-8e90-4201-b123-2f22fc7ff449.jpg" width="300" height="600"/>
## Architecture pattern Used
[MVVM](https://developer.android.com/jetpack/guide)
![alt text][logo]

[logo]: https://developer.android.com/topic/libraries/architecture/images/final-architecture.png "MVVM"

## Libraries & Tools Used
- [Architecture](https://developer.android.com/jetpack/arch/) - A collection of libraries that help you design robust, testable, and maintainable apps. Start with classes for managing your UI component lifecycle and handling data persistence.
- [Data Binding](https://developer.android.com/topic/libraries/data-binding/) - Declaratively bind observable data to UI elements.
- [Lifecycles](https://developer.android.com/topic/libraries/architecture/lifecycle) - Create a UI that automatically responds to lifecycle events.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Build data objects that notify views when the underlying database changes.
- [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) - Handle everything needed for in-app navigation.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Store UI-related data that isn't destroyed on app rotations. Easily schedule asynchronous tasks for optimal execution.
- [Repository](https://developer.android.com/jetpack/guide#fetch-data) - A Module that handle data operations, You can consider repositories to be mediators between different data sources.
- [Kotlin Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) For managing background threads with simplified code and reducing needs for callbacks.
- [Retrofit](https://square.github.io/retrofit) - A simple library that is used for network transaction.
- [Glide](https://bumptech.github.io/glide/) - For image Loading.

## Technical choices
### MVVM vs MVP
- Loose coupling between View & ViewModel, ViewModel has no reference to the View. So it isn't affected by configuration changes
- Aware by lifecycle. ViewModel save data even after rotate mobile.
- Easy to Test.
### Activities vs Fragments
- I have used a single-activity architecture which allowed me to take full advantage of the Navigation component, which mean that a single activity that manages and host multiple fragments.
- The fragment is more lite weight than Activity.
### Coroutines vs RxJava
- For me, Coroutines are simpler & readable than RxJava, and it is working very well in a small projects like that. In more complex projects may be RxJava is better to get benefit of their operators, and to handle a complex data flow. However, Coroutines have some advantages over RxJava like Channel.
### Retrofit vs Volley
- For me, Retrofit has a well-designed code, more readable.
- Recommended by Google.

### Glide
- Glide very effective for almost any case where you need to fetch, resize, cache and display a remote image.
- Support round pictures, thumbnail and placeholder which I needed in this project.


### Other Porjects
[Sona3](https://github.com/islamarr/Sona3)
[FastDo](https://github.com/Ahmedshehatah/Fast-Do)
[SMART Family](https://github.com/Ahmedshehatah/SMART_Family)
[Contact Book](https://github.com/AhmedShehatah/ContactBook)



