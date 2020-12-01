# FetchRewards

## Architecture
This app is built with MVVM architecture.

```
+-------------+   +--------------+  +--------------+   +---------------+   +---------------+
|             |   |              |  |              |   |               |   |               |
|  Activity   +---+  View Model  +--+  Repository  +---+  Remote Data  +---+  Internet     |
|             |   |              |  |              |   |  Source       |   |               |
+-------------+   +--------------+  +--------------+   +---------------+   +---------------+

```
The entire configuration is glued together by **Koin Dependency Injection**.

## Dependencies Used
* Recycler View (for displaying large lists)
* Retrofit (for Network calls)
* GSON (for JSON Serialization)
* Koin (for Dependency Injection)
* Android Architecture Components (for ViewModel and LiveData)

## Data Binding
Did not use data binding in this application.
However, observing the livedata and updating UI can be done by data binding as well.
