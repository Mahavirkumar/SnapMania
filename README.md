# SnapMania

SnapMania is a cutting-edge application that incorporates features similar to Instagram. It leverages cutting-edge technologies such as Jetpack Compose, MVVM architecture, Firebase for backend services, and Hilt for dependency injection.

## Features

- User Signup/Signin Functionality:
  - Firebase is utilized for user authentication, allowing users to sign up and sign in securely.

- Profile Screen:
  - Users can add an image, which is stored in Firebase Storage, and provide bio details to personalize their profile.

- Upload a Post:
  - Users can upload posts to share their moments with others.

- Home Screen:
  - The home screen displays a feed of posts from users.
  - If the user is not following anyone, all posts will be shown.
  - Once the user starts following others, only posts related to the followed users will be displayed.

- Like/Unlike Post:
  - Users can like or unlike posts to show their appreciation.

- Comment on Post:
  - Users can leave comments on posts to engage in conversations.

- Search Option:
  - Users can search for specific posts or users to discover new content.

- Emojis:
  - Emojis can be used throughout the application to enhance user interactions and expressions.

## Technologies Used

- Jetpack Compose: A modern UI toolkit for building native Android apps with declarative UI.
- MVVM Architecture: A software architectural pattern that separates the user interface from the business logic, promoting maintainability and testability.
- Firebase: A comprehensive development platform that provides backend services such as authentication, storage, and database.
- Hilt: A dependency injection library for Android that simplifies the process of injecting dependencies into your app, making it more modular and scalable.

## Getting Started

To get started with SnapMania, follow these steps:

1. Clone the repository.
2. Open the project in Android Studio.
3. Set up a Firebase project and add the necessary configuration files.
4. Build and run the app on an Android device or emulator.

## Contributing

Contributions are welcome! If you have any ideas or suggestions to improve SnapMania, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
