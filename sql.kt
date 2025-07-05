🧱 Database Schema (PostgreSQL)
🧍 User Table
sql
Copy
Edit
User (
  id UUID PK,
  name TEXT,
  email TEXT UNIQUE,
  phone TEXT UNIQUE,
  role ENUM('user', 'vendor', 'admin'),
  password TEXT,
  created_at TIMESTAMP
)
🛍️ Vendor Table
sql
Copy
Edit
Vendor (
  id UUID PK,
  user_id UUID FK -> User(id),
  business_name TEXT,
  description TEXT,
  location TEXT,
  is_verified BOOLEAN,
  rating FLOAT,
  profile_image TEXT
)
📅 Booking Table
sql
Copy
Edit
Booking (
  id UUID PK,
  user_id UUID FK -> User(id),
  vendor_id UUID FK -> Vendor(id),
  event_category_id UUID FK -> EventCategory(id),
  event_date DATE,
  time_slot TEXT,
  status ENUM('pending', 'confirmed', 'cancelled'),
  total_amount NUMERIC,
  created_at TIMESTAMP
)
🌟 Review Table
sql
Copy
Edit
Review (
  id UUID PK,
  booking_id UUID FK -> Booking(id),
  rating INT,
  comment TEXT,
  created_at TIMESTAMP
)
💬 Chat Table
sql
Copy
Edit
ChatMessage (
  id UUID PK,
  sender_id UUID FK -> User(id),
  receiver_id UUID FK -> User(id),
  message TEXT,
  sent_at TIMESTAMP
)
💳 Payment Table
sql
Copy
Edit
Payment (
  id UUID PK,
  booking_id UUID FK -> Booking(id),
  amount NUMERIC,
  status ENUM('success', 'failed', 'pending'),
  payment_method TEXT,
  transaction_id TEXT,
  paid_at TIMESTAMP
)
🔔 Notification Table
sql
Copy
Edit
Notification (
  id UUID PK,
  user_id UUID FK -> User(id),
  message TEXT,
  is_read BOOLEAN DEFAULT false,
  created_at TIMESTAMP
)
📂 Event Categories & Suggestions
sql
Copy
Edit
EventCategory (
  id UUID PK,
  name TEXT
)

VendorCategory (
  id UUID PK,
  vendor_id UUID FK -> Vendor(id),
  event_category_id UUID FK -> EventCategory(id),
  service_type TEXT  -- e.g., Decorator, Photographer