GraphQL Schema:
🔹 Types
graphql
Copy
Edit
type User {
  id: ID!
  name: String!
  email: String
  phone: String
  role: UserRole!
  createdAt: String
}

enum UserRole {
  USER
  VENDOR
  ADMIN
}

type Vendor {
  id: ID!
  user: User!
  vendorName: String!
  description: String
  location: String
  isVerified: Boolean
  rating: Float
  profileImage: String
  categories: [VendorCategory]
}

type VendorCategory {
  id: ID!
  eventCategory: EventCategory!
  serviceType: String!
}

type EventCategory {
  id: ID!
  name: String!
}

type Booking {
  id: ID!
  user: User!
  vendor: Vendor!
  eventCategory: EventCategory!
  eventDate: String!
  timeSlot: String!
  status: BookingStatus!
  totalAmount: Float!
  createdAt: String!
}

enum BookingStatus {
  PENDING
  CONFIRMED
  CANCELLED
}

type Review {
  id: ID!
  booking: Booking!
  rating: Int!
  comment: String
  createdAt: String!
}

type Payment {
  id: ID!
  booking: Booking!
  amount: Float!
  status: PaymentStatus!
  paymentMethod: String!
  transactionId: String
  paidAt: String
}

enum PaymentStatus {
  SUCCESS
  FAILED
  PENDING
}

type ChatMessage {
  id: ID!
  sender: User!
  receiver: User!
  message: String!
  sentAt: String!
}

type Notification {
  id: ID!
  user: User!
  message: String!
  isRead: Boolean!
  createdAt: String!
}
🔹 Queries
graphql
Copy
Edit
type Query {
  getUser(id: ID!): User
  getVendor(id: ID!): Vendor
  listVendors(categoryId: ID, location: String): [Vendor]
  listBookings(userId: ID, vendorId: ID): [Booking]
  listReviews(vendorId: ID!): [Review]
  listEventCategories: [EventCategory]
  listMessages(userId: ID!): [ChatMessage]
  getNotifications(userId: ID!): [Notification]
}
🔹 Mutations
graphql
Copy
Edit
type Mutation {
  registerUser(name: String!, phone: String!, role: UserRole!): User
  loginUser(phone: String!): String # returns JWT token

  createVendor(input: CreateVendorInput!): Vendor
  createBooking(input: CreateBookingInput!): Booking
  addReview(input: AddReviewInput!): Review
  sendMessage(input: SendMessageInput!): ChatMessage
  markNotificationRead(id: ID!): Boolean
  makePayment(input: MakePaymentInput!): Payment
}
🔹 Input Types
graphql
Copy
Edit
input CreateVendorInput {
  vendorName: String!
  description: String
  location: String!
  categories: [VendorCategoryInput]!
}

input VendorCategoryInput {
  eventCategoryId: ID!
  serviceType: String!
}

input CreateBookingInput {
  userId: ID!
  vendorId: ID!
  eventCategoryId: ID!
  eventDate: String!
  timeSlot: String!
  totalAmount: Float!
}

input AddReviewInput {
  bookingId: ID!
  rating: Int!
  comment: String
}

input SendMessageInput {
  senderId: ID!
  receiverId: ID!
  message: String!
}

input MakePaymentInput {
  bookingId: ID!
  amount: Float!
  paymentMethod: String!
}