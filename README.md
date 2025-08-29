# CarShop - Android Car Marketplace App

## Overview

CarShop is a modern Android application that serves as a car marketplace, allowing users to browse, view details, and purchase their dream cars. The app features a sleek user interface with Firebase integration for real-time data management.

## Features

- **User-Friendly Interface**: Clean and intuitive design with smooth navigation
- **Car Listings**: Browse popular cars with detailed information
- **Category Filtering**: Organize cars by different categories
- **Detailed Car Views**: Comprehensive information including specifications, pricing, and images
- **User Profiles**: Personal profiles with additional functionality
- **Firebase Integration**: Real-time data synchronization and persistence
- **Responsive Design**: Optimized for various screen sizes

## Technical Stack

- **Language**: Java
- **Minimum SDK**: Android 5.0 (API level 21)
- **Architecture**: MVC (Model-View-Controller)
- **Database**: Firebase Realtime Database
- **Image Loading**: Glide
- **UI**: Material Design components with ConstraintLayout

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/shopcar/
│   │   │   ├── Activity/
│   │   │   │   ├── BaseActivity.java
│   │   │   │   ├── DetailActivity.java
│   │   │   │   ├── IntoActivity2.java
│   │   │   │   ├── MainActivity.java
│   │   │   │   └── ProfileActivity.java
│   │   │   ├── Adapter/
│   │   │   │   ├── CategoryAdapter.java
│   │   │   │   └── CarAdapter.java
│   │   │   ├── Domain/
│   │   │   │   ├── CategoryDomain.java
│   │   │   │   └── CarDomain.java
│   │   │   └── databinding/
│   │   └── res/
│   │       ├── layout/
│   │       │   ├── activity_detail.xml
│   │       │   ├── activity_into2.xml
│   │       │   ├── activity_main.xml
│   │       │   ├── activity_profile.xml
│   │       │   ├── viewholder_category.xml
│   │       │   └── viewholder_car.xml
│   │       └── drawable/
│   │           ├── Various drawable resources
│   │           └── ...
```

## Key Components

### Activities

1. **BaseActivity**: 
   - Initializes Firebase with persistence enabled
   - Sets fullscreen layout flags
   - Serves as parent class for other activities

2. **IntoActivity2**:
   - Welcome/Introduction screen
   - Navigation to MainActivity

3. **MainActivity**:
   - Home screen with category and popular car listings
   - Implements bottom navigation
   - Fetches data from Firebase

4. **DetailActivity**:
   - Displays detailed car information
   - Shows specifications, pricing, and images

5. **ProfileActivity**:
   - User profile management
   - Additional functionality sections

### Data Models

- **CarDomain**: Represents car data with properties like title, description, capacity, speed, engine output, price, and image URL
- **CategoryDomain**: Represents car categories

### Adapters

- **CategoryAdapter**: Handles category list display
- **CarAdapter**: Manages car item display in grids

## Firebase Integration

The app uses Firebase Realtime Database with:
- Data persistence enabled for offline functionality
- Two main data nodes: "Category" and "Cars"
- Efficient data loading with progress indicators

## UI/UX Features

- Fullscreen immersive experience
- Responsive layouts using ConstraintLayout
- Custom drawable resources for buttons and backgrounds
- Smooth scrolling with RecyclerView
- Progress indicators for data loading states
- Bottom navigation bar
- Detailed car specification cards

## Setup Instructions

1. Clone or download the project
2. Open in Android Studio
3. Add your Firebase configuration (google-services.json)
4. Set up Firebase Realtime Database with the required structure:
   - "Category" node for car categories
   - "Cars" node for car listings
5. Build and run the application

## Usage

1. Launch the app to see the introduction screen
2. Tap "Get Started" to navigate to the main screen
3. Browse categories horizontally or view popular cars in a grid
4. Tap on any car to view detailed information
5. Use the bottom navigation to access different sections
6. Access your profile for additional options

## Customization

- Modify colors in `res/values/colors.xml`
- Update drawable resources in `res/drawable/`
- Adjust layout files for different screen configurations
- Extend Firebase data structure for additional features

## Dependencies

- Firebase BoM (Bill of Materials)
- Firebase Database
- Glide for image loading
- AndroidX libraries (AppCompat, RecyclerView, ConstraintLayout, etc.)

## Future Enhancements

- User authentication
- Shopping cart functionality
- Favorite cars feature
- Search functionality
- Payment integration
- Push notifications
