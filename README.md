# Native Spring AI

This is a travel recommendation service built with Spring AI, OpeAI, and GraalVM. The base is a regular Spring app, and the integration with OpenAI is implemented in `RecommendationService`. Note that the app is using `OPENAI_API_KEY`.

## Build a native app with GraalVM:

```shell
mvn -Pnative native:compile -DskipTests
```

## Start the app and navigate to the travel request form:

```shell
./target/travelapp
http://localhost:8080/request
```

After submitting your preferences, you'll get a generated recommendation – for example:

```
Here is your travel recommendation!💁‍♀️

Destination suggestion: Zurich, Switzerland Zurich is not only known for its stunning views and picturesque landscapes, but it also offers a vibrant nightlife scene with plenty of cocktail bars and lounges to explore. As an adventurous traveler, you can immerse yourself in the city's energetic atmosphere and try out unique and creative cocktails at trendy bars. During the day, you can also take advantage of Zurich's outdoor activities such as hiking in the nearby mountains or cruising on Lake Zurich. And for the ultimate adventure, you can even try paragliding or skydiving for a truly unforgettable experience.

Enjoy your trip!👋
```