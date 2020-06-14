FROM devopsedu/webapp
CMD ["apache2ctl", "-D", "FOREGROUND"]
RUN rm var/www/html/index.html
ADD website /var/www/html/
