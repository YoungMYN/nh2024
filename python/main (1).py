import telebot
from telebot import types
import time
import xlrd
import pandas as pd
import pyexcel
import json
import os
import requests

bot = telebot.TeleBot('6426018216:AAG3Bky4knXSIxFLcs9Xz-_tqz7A3A-aGek')
url = 'http://localhost:8080/api/transaction'


#@FraudTransactions_Bot
@bot.message_handler(commands = ['start'])
def start(message):
    bot.send_message(message.chat.id, 'Добрый день! Отправьте файл в формате json')
    #bot.register_next_step_handler(message, processing)


@bot.message_handler(content_types=['document'])
def processing(json_file):
    file_info = bot.get_file(json_file.document.file_id)
    file_path = file_info.file_path
    downloaded_file = bot.download_file(file_path)

    print(file_info)
    print(type(file_info))
    extension = os.path.splitext(file_path)[1].lower()
    print(extension)
    downloaded_file = downloaded_file.decode('utf-8')
    print(downloaded_file)
    print(type(downloaded_file)) # str

    if extension == '.json':
        bot.send_message(json_file.chat.id, "получил json")
        my_dict = eval(downloaded_file)
        print(my_dict)
        print(type(my_dict))
        response = requests.post(url, json=my_dict)
        answer = response.text
        print(response.text)
        bot.send_message(json_file.chat.id, answer)

    else:
        bot.send_message(json_file.chat.id, "json нужен")


bot.polling(none_stop=True)
