movies = {}


def movies_list():
    return movies

def add_movie(movie):
    movies_list().setdefault(movie, [])


def movies_rating(movie):
    if movie not in movies_list():
        print("Movie not found.")
        return
    try:
        rating = float(input("Enter a rating from 1 to 5: "))
        if not 1 <= rating <= 5:
            print("Rating must be between 1 and 5.")
            return
        movies_list()[movie].append(rating)
    except ValueError:
        print("Please enter a valid number.")



movie_rating_system = True

while(movie_rating_system):
    choice = input("""
=============================
-----MOVIE RATING SYSTEM-----
=============================
1.  Add a Movie
2.  Rate a Movie
3.  View Average Rating
4.  Exit
=============================
""")

match(choice):
    case "1":
        movie = input("Enter the movie title: ").strip()
        if movie:
            add_movie(movie)
            print(f"Added '{movie}'.")
        else:
            print("Movie title cannot be empty.")
    case "2":
        movie = input("Enter the movie title to rate: ").strip()
        movies_rating(movie)
    case "3":
        movie = input("Enter the movie title: ").strip()
        ratings = movies_list().get(movie)
        if ratings is None:
            print("Movie not found.")
        elif ratings:
            print(f"Average rating for '{movie}': {sum(ratings) / len(ratings):.2f}")
        else:
            print("This movie has no ratings yet.")
    case "4":
        movie_rating_system = False
    case _:
        print("Invalid choice. Please select 1, 2, 3, or 4.")
    

