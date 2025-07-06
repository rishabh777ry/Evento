✅ Project Itinerary: 7 Days Starting Today (Sunday, July 7, 2025)
📅 Day 1 – Sunday, 7 July 2025
[Time: Flexible, aim 4–6 hours]
Goal: Full Project Setup

 Create GitHub repo(s)

 Init:

✅ KMP mobile project

✅ Flutter Web project

✅ Kotlin Backend (Ktor preferred)

 Init PostgreSQL DB (install locally or via Docker)

 Apply DB schema (I'll send)

 Create Firebase project

Enable Phone Auth

Download serviceAccountKey.json

Add Android SHA key

 Init Firebase Admin SDK in backend

📅 Day 2 – Monday, 8 July 2025
[Time: 9 PM – 12 AM]
Goal: Firebase OTP Login Flow

 Mobile App:

Implement phone number login screen

Receive idToken after OTP verification

 Send idToken to backend

 Backend:

Verify token via Firebase Admin

Generate custom JWT

Return authToken + user data

📅 Day 3 – Tuesday, 9 July 2025
[Time: 9 PM – 12 AM]
Goal: User Creation + Role Navigation

 Backend:

Check if user exists by UID/Phone

If not, insert new user (with default role: USER)

 Frontend:

Store authToken

Role-based navigation (User → Home, Vendor → Dashboard)

📅 Day 4 – Wednesday, 10 July 2025
[Time: 9 PM – 12 AM]
Goal: Admin Panel Base

 Setup Flutter Web routing (GoRouter)

 Create layout (Sidebar + AppBar)

 Add dummy Dashboard Page (Stats: total users, vendors)

 Setup GraphQL client

📅 Day 5 – Thursday, 11 July 2025
[Time: 9 PM – 12 AM]
Goal: Vendor Onboarding + Admin Approval

 Mobile:

Add vendor registration form (business name, location, category)

 Backend:

Create vendor entry (linked to user)

 Admin Panel:

Show vendor list (filter by pending/approved)

Approve/reject toggle

📅 Day 6 – Friday, 12 July 2025
[Time: 9 PM – 12 AM]
Goal: Booking System Core

 Mobile:

Browse vendors by category

Booking form (date, slot)

 Backend:

Create booking, list by user/vendor

 Admin Panel:

Show bookings list

Filters by date/status/vendor

📅 Day 7 – Saturday, 13 July 2025
[Time: Flexible (3–4 hrs)]
Goal: Reviews + Notifications

 Mobile:

Add review post-booking

 Backend:

Store/retrieve reviews

Notification entry in DB

 Admin:

Moderate reviews

(Optional) Setup FCM to send push