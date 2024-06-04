import speech_recognition as sr
from gtts import gTTS
import os
import wikipedia
import pywhatkit
from datetime import datetime

def listen():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        audio = recognizer.listen(source)
    try:
        query = recognizer.recognize_google(audio, language='en-US')
        print(f"You said: {query}")
    except sr.UnknownValueError:
        print("Sorry, I did not understand that.")
        return ""
    except sr.RequestError:
        print("Sorry, my speech service is down.")
        return ""
    return query.lower()

def speak(text):
    tts = gTTS(text=text, lang='en')
    filename = "audio/response.mp3"
    tts.save(filename)
    os.system(f"mpg321 {filename}")

def process_command(command):
    if 'wikipedia' in command:
        topic = command.replace('wikipedia', '')
        summary = wikipedia.summary(topic, sentences=2)
        speak(summary)
    elif 'play' in command:
        song = command.replace('play', '')
        speak(f"Playing {song}")
        pywhatkit.playonyt(song)
    elif 'time' in command:
        current_time = datetime.now().strftime('%I:%M %p')
        speak(f"Current time is {current_time}")
    else:
        speak("I am sorry, I don't understand that command.")

def main():
    while True:
        query = listen()
        if query:
            process_command(query)

if __name__ == "__main__":
    main()
