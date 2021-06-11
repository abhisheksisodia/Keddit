# Repository

This repository is a collection of apps developed to learn Kotlin and modern Android development concepts

## Projects 
- DiceRoller - Simple dice roll app
- Guess It - Guess It is a word guessing app you can play with one or more friends. To play, hold the device in landscape, facing away from you with your thumbs on the Skip and Got It buttons. Your friends can then give you clues to help you guess the word.
- Keddit - Reddit app written in Kotlin
- Sleeptracker - The SleepQualityTracker app is a demo app that helps collect information about your sleep.
- WeatherKnot - Weather app written in Kotlin
- MySoothe - Beautiful meditation app written using Jetpack Compose

## Code formatting
The CI uses [Spotless](https://github.com/diffplug/spotless) to check if your code is formatted correctly and contains the right licenses.
Internally, Spotless uses [ktlint](https://github.com/pinterest/ktlint) to check the formatting of your code.
To set up ktlint correctly with Android Studio, follow one of the [listed setup options](https://github.com/pinterest/ktlint#-with-intellij-idea).

Before committing your code, run `./gradlew app:spotlessApply` to automatically format your code.

## Design mocks
* [Bloom](https://github.com/android/android-dev-challenge-compose/blob/assets/Bloom.zip)
* [MySoothe](https://github.com/android/android-dev-challenge-compose/blob/assets/MySoothe.zip)
* [WeTrade](https://github.com/android/android-dev-challenge-compose/blob/assets/WeTrade.zip)

## License
```
Copyright 2020 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
