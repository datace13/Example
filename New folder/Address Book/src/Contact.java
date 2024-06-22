public class Contact {
    class Contact:
    def __init__(self, name, phone):
    self.name = name
    self.phone = phone

    def __str__(self):
            return f"Name: {self.name}, Phone: {self.phone}"

    class HashTable:
    def __init__(self):
    self.table = {}

    def add_contact(self, contact):
    self.table[contact.name] = contact.phone

    def find_contact(self, name):
            return self.table.get(name, "Not found")

    def display_contacts(self):
            if not self.table:
    print("No contacts available.")
        else:
                for name, phone in self.table.items():
    print(f"Name: {name}, Phone: {phone}")

    def main():
    hash_table = HashTable()

    while True:
    print("\nContact Manager")
    print("1. Add new contact")
    print("2. Find a contact by name")
    print("3. Display contacts")
    print("4. Exit")

    choice = input("Enter your choice: ")

        if choice == '1':
    name = input("Enter name: ")
    phone = input("Enter phone: ")
    contact = Contact(name, phone)
            hash_table.add_contact(contact)
    print("Contact added successfully.")

    elif choice == '2':
    name = input("Enter the name to search: ")
    phone = hash_table.find_contact(name)
            if phone == "Not found":
    print("Not found")
            else:
    print(f"Phone: {phone}")

    elif choice == '3':
            hash_table.display_contacts()

    elif choice == '4':
    print("Exiting the application.")
            break

                    else:
    print("Invalid choice. Please try again.")

if __name__ == :
    main()

}
