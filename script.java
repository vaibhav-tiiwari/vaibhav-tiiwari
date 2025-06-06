// आप यहां JavaScript कोड जोड़ सकते हैं, जैसे स्क्रॉल पर नेविगेशन सक्रिय करना
// या भविष्य में कोई अन्य इंटरैक्टिव सुविधाएँ।
// अभी के लिए यह फ़ाइल खाली रह सकती है।

document.addEventListener('DOMContentLoaded', function() {
    // उदाहरण के लिए, आप नेविगेशन लिंक पर क्लिक करने पर स्मूथ स्क्रॉलिंग जोड़ सकते हैं
    document.querySelectorAll('nav a').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();

            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });
});
