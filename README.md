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
* Recycler View
* Retrofit
* GSON
* Koin
* Android Architecture Components
