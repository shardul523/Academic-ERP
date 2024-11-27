INSERT INTO Courses (course_code, name, description, term, faculty, credits, capacity)
VALUES
('CSAI101', 'Introduction to Artificial Intelligence', 'An introductory course covering the foundations of AI, including problem-solving and search algorithms.', 'Fall', 'Dr. Alice Smith', 4, 50),
('CSAI201', 'Machine Learning', 'A course focused on supervised, unsupervised, and reinforcement learning techniques.', 'Spring', 'Dr. John Doe', 4, 50),
('CSAI301', 'Deep Learning', 'An advanced course exploring neural networks and their applications.', 'Fall', 'Dr. Sarah Johnson', 3, 40),
('CSAI401', 'Natural Language Processing', 'A course covering language models, sentiment analysis, and chatbots.', 'Spring', 'Dr. Alice Smith', 4, 50),
('CSDS101', 'Introduction to Data Science', 'An overview of data analysis, visualization, and statistical methods.', 'Fall', 'Dr. Michael Lee', 4, 60),
('CSDS201', 'Data Mining', 'A course on discovering patterns in large datasets.', 'Spring', 'Dr. Emily Clark', 4, 50),
('CSDS301', 'Big Data Analytics', 'A course focusing on processing and analyzing large-scale data systems.', 'Fall', 'Dr. Michael Lee', 4, 40),
('CSDS401', 'Data Visualization', 'Learn techniques for creating insightful data visualizations.', 'Spring', 'Dr. Emily Clark', 3, 40),
('CSCY101', 'Introduction to Cybersecurity', 'Basic principles of securing networks, systems, and applications.', 'Fall', 'Dr. Jane Cooper', 4, 50),
('CSCY201', 'Network Security Fundamentals', 'Study of securing computer networks from cyber threats.', 'Spring', 'Dr. Robert Brown', 3, 50),
('CSCY301', 'Ethical Hacking', 'Learn techniques for ethical penetration testing and vulnerability assessment.', 'Fall', 'Dr. Jane Cooper', 4, 40),
('CSCY401', 'Cryptography and Security', 'Advanced study of encryption and secure communication protocols.', 'Spring', 'Dr. Robert Brown', 4, 50);

INSERT INTO Employees(first_name, last_name, email, password, title)
VALUES
    ('Alice', 'Johnson', 'alice.johnson@example.com', '$2a$10$D88Drz1sPVANjINlx6eO6eE4b8IjXU3GjG0.R9QYP.ERE89BtJnnC', 'Professor'),
    ('Brian', 'Lee', 'brian.lee@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Professor'),
    ('Clara', 'Martinez', 'clara.martinez@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Assistant Professor'),
    ('Emily', 'Carter', 'emily.carter@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Professor'),
    ('George', 'Evans', 'george.evans@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Professor'),
    ('Diana', 'Smith', 'diana.smith@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Assistant Professor'),
    ('Henry', 'Adams', 'henry.adams@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Professor'),
    ('Ivy', 'Brown', 'ivy.brown@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Professor'),
    ('Jack', 'Robinson', 'jack.robinson@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Lecturer'),
    ('Karen', 'White', 'karen.white@example.com', '$2a$10$8P2lpbkpIYSXEKKMJuyD1.xuphW/doOBanFVZTZ1cKd3QsNgvfySe', 'Lecturer');

INSERT INTO Specialisation (code, name, description, `year`, credits_required)
VALUES
    ('CSAI', 'Artificial Intelligence', 'A specialization focusing on the foundations and applications of AI, including machine learning and data processing techniques.', 4, 120),
    ('CSDS', 'Data Science', 'A specialization emphasizing statistical analysis, data modeling, and practical implementation of data-driven solutions.', 4, 115),
    ('CSCY', 'Cybersecurity', 'A specialization dedicated to securing networks, systems, and applications against cyber threats and vulnerabilities.', 4, 110);

INSERT INTO Students (roll_number, first_name, last_name, email, cgpa, total_credits, `year`, specialisation)
VALUES
    ('CSAI1001', 'John', 'Doe', 'john.doe@example.com', 3.75, 90, 3, 1),
    ('CSDS1002', 'Jane', 'Smith', 'jane.smith@example.com', 3.90, 95, 4, 2),
    ('CSCY1003', 'Michael', 'Brown', 'michael.brown@example.com', 3.40, 70, 2, 3),
    ('CSAI1004', 'Emily', 'Davis', 'emily.davis@example.com', 3.65, 85, 3, 1),
    ('CSDS1005', 'William', 'Garcia', 'william.garcia@example.com', 3.80, 100, 4, 2),
    ('CSCY1006', 'Sophia', 'Martinez', 'sophia.martinez@example.com', 3.50, 75, 2, 3),
    ('CSAI1007', 'James', 'Johnson', 'james.johnson@example.com', 3.95, 105, 4, 1),
    ('CSDS1008', 'Isabella', 'Lopez', 'isabella.lopez@example.com', 3.85, 90, 3, 2),
    ('CSCY1009', 'Alexander', 'Wilson', 'alexander.wilson@example.com', 3.60, 80, 3, 3),
    ('CSAI1010', 'Mia', 'Taylor', 'mia.taylor@example.com', 3.70, 92, 3, 1),
    ('CSDS1011', 'Ethan', 'Moore', 'ethan.moore@example.com', 3.45, 65, 2, 2),
    ('CSCY1012', 'Charlotte', 'Thomas', 'charlotte.thomas@example.com', 3.55, 78, 2, 3);
